
public class Selectionsort {
	public static void main(String[] args) {
		int[] arr = { 7, 5, 4, 8, 12, 14, 16 };
		Selectionsort obj = new Selectionsort();
		int[] res=obj.selection_sort(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}

	public int[] selection_sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min=i;
			for (int j = i + 1; j < arr.length; j++) {
                 if(arr[j]<arr[min])
                	 min=j;
	 		}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
}
