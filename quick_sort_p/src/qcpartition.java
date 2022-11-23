public class qcpartition{

    public static void main(String[] args) {
        String[] str={"a","b","a","c","b","d","f","b","e","a","g"};

        partition(str, 0, 4);
        System.out.println(str);
    }
    static int partition(String arr[], int start, int end) {
		String pivot = arr[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (pivot.compareTo(arr[i])>=0) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, pIndex, end);
		return pIndex;
	}

	static void swap(String arr[], int x, int y) {
		String temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}