class Allsort
{
	void bubblesort(int a1[])
{
	int n=a1.length;
	for(int i=0; i<n-1; i++)//iterations
		for(int j=0;j<n-i-1;j++)//elements comparision
		{
			if(a1[j] > a1[j+1])
			{
				int temp = a1[j];
				a1[j] = a1[j+1];
				a1[j+1] = temp;
			}
		}
}

void selectionsort(int a1[])
{
	int n=a1.length;
	
	for(int i=0;i<n-1;i++)
	{
		int min = i;
		for(int j=i+1;j<n;j++)
		{
			if(a1[j] < a1[min])//7 ,6 =>6
				min = j;//min =6
		}
		int temp = a1[min];
		a1[min] = a1[i];
		a1[i] = temp;

	}
	
}

void insertionsort(int a1[])
{
	int n=a1.length;
	for(int i=1;i<n;i++)
	{
		int key = a1[i];
		int j= i-1;//0
		
		while(j>=0 && a1[j] > key)
		{
				a1[j+1] = a1[j];
				j=j-1;
		}
		a1[j+1] = key;
	}
}

void merge(int a1[], int l, int m, int r)
		{
			//size of sub a1ay
			int n1 = m - l + 1;
			int n2 = r - m;

			//L and R a1ay declaration
			int L[] = new int[n1];
			int R[] = new int[n2];

			//Left array
			for (int i = 0; i < n1; ++i)
				L[i] = a1[l + i];
			//Right array
			for (int j = 0; j < n2; ++j)
				R[j] = a1[m + 1 + j];

			

			
			int i = 0, j = 0;

			// Merge logic
			int k = l;
			while (i < n1 && j < n2) {
				//insert in left
				if (L[i] <= R[j]) {
					a1[k] = L[i];
					i++;
				}
				//insert in right
				else {
					a1[k] = R[j];
					j++;
				}
				k++;
			}

			//L remaining
			while (i < n1) {
				a1[k] = L[i];
				i++;
				k++;
			}

			//R remaining
			while (j < n2) {
				a1[k] = R[j];
				j++;
				k++;
			}
		}

		//Combine
		void mergesort(int a1[], int l, int r)
		{
			if (l < r) {
			
				int m =l+ (r-l)/2;

				//call for left suba1ay
				mergesort(a1, l, m);
				
				//call for right suba1ay
				mergesort(a1, m + 1, r);

				
				merge(a1, l, m, r);
			}
		}

static void swap(int[] a1, int i, int j)
	{
		int temp = a1[i];
		a1[i] = a1[j];
		a1[j] = temp;
	}

	//partition
	static int partition(int[] a1, int low, int high)
	{
		

		int pivot = a1[high];
		

		int i = (low - 1);

		for(int j = low; j <= high - 1; j++)
		{
			

			if (a1[j] < pivot)
			{
				
				
				i++;
				swap(a1, i, j);
			}
		}
		swap(a1, i + 1, high);
		return (i + 1);
	}


	static void quickSort(int[] a1, int low, int high)
	{
		if (low < high)
		{
			
			
			int pi = partition(a1, low, high);

			quickSort(a1, low, pi - 1);
			quickSort(a1, pi + 1, high);
		}
	}

	public void heapsort(int a1[])
	{
		int n = a1.length;

		
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(a1, n, i);

		
		for (int i = n - 1; i > 0; i--) {
			
			int temp = a1[0];
			a1[0] = a1[i];
			a1[i] = temp;

			
			heapify(a1, i, 0);
		}
	}

	
	void heapify(int a1[], int n, int i)
	{
		int largest = i; 
		int l = 2 * i ; 
		int r = 2 * i + 1; 

		
		if (l < n && a1[l] > a1[largest])
			largest = l;

		
		if (r < n && a1[r] > a1[largest])
			largest = r;


		if (largest != i) {
			int temp = a1[i];
			a1[i] = a1[largest];
			a1[largest] = temp;

			heapify(a1, n, largest);
		}
	}

void display(int a1[])
{
	int n = a1.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	System.out.println();	
}
	public static void main(String args[])
	{
		int a1[] = {44, 66, 22, 77, 55, 12, 45};
		Allsort b1 = new Allsort();
		b1.display(a1);
		int n = a1.length;
		
		b1.heapsort(a1);
		b1.display(a1);
		
	}
}
