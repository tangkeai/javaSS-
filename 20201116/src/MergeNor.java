





public class MergeNor {
    public void merge(int[] array,int gap) {
        int len = array.length;
        int s1 = 0;
        int e1 = s1+ gap- 1;
        int s2 = e1 + 1;
        int e2 = s2+gap-1 < len ? s2+gap-1 : len -1;
        int[] tmpArr = new int[len];
        int k = 0;
        while (s2 < len) {
            while (s1 <= e1 && s2 <= e2) {
                if(array[s1] <= array[s2]) {
                    tmpArr[k++] = array[s1++];
                }else {
                    tmpArr[k++] = array[s2++];
                }
            }
            while (s1 <= e1) {
                tmpArr[k++] = array[s1++];
            }
            while (s2 <= e2) {
                tmpArr[k++] = array[s2++];
            }
            s1 = e2 + 1;
            e2 = s1 + gap -1;
            s2 = e2 + 1;
            e2 = s2+gap-1 < len ? s2+gap-1 : len -1;
        }
        while (s1 < len) {
            tmpArr[k++] = array[s1++];
        }
        for (int i = 0; i < len; i++) {
            array[i] = tmpArr[i];
        }
    }

    public void mergeNor(int[] array) {
        //传入归并段
        for (int i = 1; i < array.length; i*=2) {
            merge(array,i);
        }

    }

    public static void main(String[] args) {
        
    }
}
