import sys
import time

def openfile():
	file_name = 'data1000.txt'
	minsupport = 1000*0.10
	nbuckets = 5
	doc = open(file_name).read()
	newfile = doc.split()
	baskets = []
	for x in newfile:
		baskets.append(x.split(','))

	freqItems(minsupport,nbuckets,baskets);

def freqItems(minsupport,nbuckets,baskets):
	start1 = time.time()
	candidatelist1 = []
	finalist1 = []

	for i in range(0, len(baskets)):
		for b in baskets[i]:
			candidatelist1.append(b)

	candidatelist1=sorted(set(candidatelist1))
	# print(candidatelist1)

	count = 0
	for k in candidatelist1:
		for i in range(0, len(baskets)):
			for j in baskets[i]:
				if(k == j):
					count += 1
		if count >= minsupport:
			finalist1.append(k)
		count = 0

	itemIDs = {}
	counter = 1
	for c in candidatelist1:
		itemIDs[c] = counter
		counter += 1

	if finalist1:
		print("")
		print("Frequent Items:")
		for x in finalist1:
			print(x)
		print("Time Taken (Frequent Items): " + str(time.time() - start1))

		doubles(minsupport,nbuckets,itemIDs,baskets,finalist1);


def doubles(minsupport,nbuckets,itemIDs,baskets,finalist1):
	start2 = time.time()

	countofbuckets = [0]*nbuckets
	bitmap = [0]*nbuckets
	pairs = []

	for i in range(0, len(baskets)):
		for x in range(0, len(baskets[i])-1):
			for y in range(x+1, len(baskets[i])):
				if(baskets[i][x] < baskets[i][y]):
					countofbuckets[int(str(itemIDs[baskets[i][x]]) + str(itemIDs[baskets[i][y]]))%nbuckets]+=1
					if ([baskets[i][x],baskets[i][y]] not in pairs):
						pairs.append(sorted([baskets[i][x],baskets[i][y]]))
				else:
					countofbuckets[int(str(itemIDs[baskets[i][y]]) + str(itemIDs[baskets[i][x]]))%nbuckets]+=1
					if ([baskets[i][y],baskets[i][x]] not in pairs):
						pairs.append(sorted([baskets[i][y],baskets[i][x]]))

	pairs = sorted(pairs)

	for x in range(0, len(countofbuckets)):
		if countofbuckets[x] >= minsupport:
			bitmap[x] = 1
		else:
			bitmap[x] = 0

	prunedpairs = []


	for i in range(0, len(pairs)):
		for j in range(0, len(pairs[i])-1):
			if(pairs[i][j] in finalist1 and pairs[i][j+1] in finalist1):
				prunedpairs.append(pairs[i])

	candidatelist2 = []

	for i in range(0, len(prunedpairs)):
		for j in range(0, len(prunedpairs[i])-1):
			if bitmap[int(str(itemIDs[prunedpairs[i][j]]) + str(itemIDs[prunedpairs[i][j+1]]))%nbuckets] == 1:
				candidatelist2.append(prunedpairs[i])

	finalist2 = []
	count2 = 0
	for c in range(0, len(candidatelist2)):
		for b in range(0, len(baskets)):
			if set(candidatelist2[c]).issubset(set(baskets[b])):
				count2 += 1
		if count2 >= minsupport and count2 != 0:
			finalist2.append(sorted(candidatelist2[c]))
		count2 = 0

	finalist2=sorted(finalist2)

	if finalist2:
		print("")
		print("Frequent Doubles:")
		for b in finalist2:
			print(','.join(b))
		print("Time Taken (Doubles): " + str(time.time() - start2))
		triples(minsupport,nbuckets,itemIDs,baskets,finalist2);


def triples(minsupport,nbuckets,itemIDs,baskets,prevout):

	start3 = time.time()

	countofbuckets3 = [0]*nbuckets
	bitmap3 = [0]*nbuckets
	combination3 = []
	prevout = prevout

	for a in prevout:
		for b in prevout:
			if(a != b):
				if set(a) & set(b) and len(list(set(a) & set(b))) >= 1:
					combination3.append(sorted(set(a)|set(b)))

	combination3 = sorted(combination3)

	hashingstring = ""

	for i in range(0, len(combination3)):
		for x in combination3[i]:
			hashingstring += str(itemIDs[x])
		countofbuckets3[int(hashingstring)%nbuckets] += 1
		hashingstring = ""

	for x in range(0, len(countofbuckets3)):
		if countofbuckets3[x] >= minsupport:
			bitmap3[x] = 1
		else:
			bitmap3[x] = 0

	hashingstring = ""
	klist=[]

	for i in range(0, len(combination3)):
		for j in combination3[i]:
			hashingstring += str(itemIDs[j])
		if bitmap3[int(hashingstring)%nbuckets] == 1:
			klist.append(combination3[i])
		teststring = ""

	candidatelistk = []
	count3 = 1
	for i in range(1, len(klist)):
		if klist[i] == klist[i-1]:
			count3 += 1
		else:
			if count3 >= 3:
				candidatelistk.append(klist[i-1])
			count3 = 1
	if count3 >= 3:
		candidatelistk.append(klist[i-1])
		# print("ELement is: ",klist[i-1]," and count is: ",count)

	output = []
	counter = 0
	for c in range(0, len(candidatelistk)):
		for b in range(0, len(baskets)):
			if set(candidatelistk[c]).issubset(set(baskets[b])):
				counter += 1
		if counter >= minsupport and counter != 0:
			output.append(candidatelistk[c])
		counter = 0

	if output:
		print("")
		print("Frequent Triples:")
		for b in output:
			print(','.join(b))
		print("Time Taken (Triples): " + str(time.time() - start3))
		# print("\n")

openfile();
