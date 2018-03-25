import sys
import time

def openfile():

	file_name = "datafinal.txt"
	minsupport = 16887*0.05
	#minsupport = 16887 * 0.10

	doc = open(file_name).read()
	newfile=doc.split()

	baskets=[]
	for x in newfile:
		baskets.append(x.split(','))

	freqItems(minsupport,baskets);

def freqItems(minsupport,baskets):

	start1 = time.time()
	candidatelist1=[]
	finalist1=[]

	for i in range(0, len(baskets)):
		for b in baskets[i]:
			candidatelist1.append(b)

	candidatelist1=sorted(set(candidatelist1))

	count=0
	for k in candidatelist1:
		for i in range(0, len(baskets)):
			for j in baskets[i]:
				if(k==j):
					count+=1
		if count>=minsupport:
			finalist1.append(k)
		count=0

	finalist1=sorted(finalist1)
	print("Frequent Items:")
	for x in finalist1:
		print(x)
	print("Time Taken (Single Items): " + str(time.time()-start1))
	doubles(minsupport,baskets,finalist1);

def doubles(minsupport,baskets,finalist1):
	start2 = time.time()
	candidatelist2=[]
	finalist2=[]

	for x in range(0,len(finalist1)-1):
		for y in range(x+1,len(finalist1)):
			candidatelist2.append([finalist1[x],finalist1[y]])

	count2=0
	for c in range(0,len(candidatelist2)):
		for b in range(0,len(baskets)):
			if set(candidatelist2[c]).issubset(set(baskets[b])):
				count2+=1
		if count2>=minsupport and count2!=0:
			finalist2.append(candidatelist2[c])
		count2=0

	finalist2=sorted(finalist2)

	print("")
	print("Frequent Doubles")
	for b in finalist2:
		print(','.join(b))
	print("Time Taken (Doubles): " + str(time.time()-start2))

	triples(minsupport,baskets,finalist2);


def triples(minsupport,baskets,freqdoubles):

	start3 = time.time()
	combination3=[]
	freqdoubles=freqdoubles
	for a in freqdoubles:
		for b in freqdoubles:
			if(a!=b):
				combination3.append(sorted(set(a)|set(b)))

	combination3=sorted(combination3)

	candidatelist3=[]

	count3=1
	for i in range(1, len(combination3)):
		if combination3[i]==combination3[i-1]:
			count3+=1
		else:
			candidatelist3.append(combination3[i-1])
			count3=1
	output=[]
	counter=0
	for c in range(0,len(candidatelist3)):
		for b in range(0,len(baskets)):
			if set(candidatelist3[c]).issubset(set(baskets[b])):
				counter+=1
		if counter>=minsupport and counter!=0:
			output.append(candidatelist3[c])
		counter=0

	if output:
		print("")
		print("Frequent Triples:")
		for b in output:
			print(','.join(b))
		print("Time Taken (Triples): " + str(time.time()-start3))

openfile();
