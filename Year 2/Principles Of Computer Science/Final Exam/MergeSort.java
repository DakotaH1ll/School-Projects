package csci2010u;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = { 4, 11, 17, 42, 5000, 3, 93, 36 };
		// printArray(data);
		int sortedData[] = mergeSort(data);
		// printArray(sortedData);
	}

	static int[] mergeSort(int[] data) {
		int halfLen = (data.length / 2);
		if (data.length == 0) {
			System.out.println("The array is empty!");
			return null;
		} else {
			int[] frontHalf = new int[halfLen];
			int[] backHalf = new int[halfLen];
			for (int i = 0; i > halfLen; i++) {
				frontHalf[i] = data[i];
				backHalf[i] = data[i + halfLen];

				for (int j = 0; j < frontHalf.length; j++) {
					if (frontHalf[j] > frontHalf[j + 1])
						;
					frontHalf[j] = frontHalf[j + 1];
					frontHalf[j + 1] = frontHalf[j];
					j++;
				}

				for (int k = 0; k < backHalf.length; k++) {
					if (backHalf[k] > backHalf[k + 1])
						;
					backHalf[k] = frontHalf[k + 1];
					backHalf[k + 1] = backHalf[k];
					k++;
				}
			}
			int[] frontSorted = mergeSort(frontHalf);
			int[] backSorted = mergeSort(backHalf);
			
			int[] sorted = concat(frontSorted, backSorted);
		}
		return sorted;
	}
}