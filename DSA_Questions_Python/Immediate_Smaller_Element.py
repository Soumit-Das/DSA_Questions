def immediateSmaller(self,arr,n):
		ans = []
		
		for i in range(n - 1):
            if arr[i] > arr[i + 1]:
                arr[i] = arr[i + 1]
            else:
                arr[i] = -1
		        
		arr[n-1] = -1              
		        
	    return arr	


arr = [1,2,3,4,2,1,0]

print(immediateSmaller(arr,7))