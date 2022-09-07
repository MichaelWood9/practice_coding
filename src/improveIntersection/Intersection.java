package improveIntersection;



import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Intersection {



    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

    public List<Integer> intersectionFast(int[] a, int[] b) {
        int pointerA = 0;
        int pointerB = 0;
        List<Integer> result = new LinkedList<>();
        mergeSort(a);
        mergeSort(b);

        for(int x = 0; x <= 5;x++){
            if(a[pointerA] == b[pointerB]){
                result.add(b[pointerB]);
                pointerA++;
                pointerB++;

            }
            else if (a[pointerA] > b[pointerB]){
                   pointerB++;

            }

            else if (a[pointerA] < b[pointerB]){
                    pointerA++;

            }


        }
        return result;
    }

    public void mergeSort(int[] input) {
        Arrays.sort(input);
    }

    public static void main(String[] args) {
        Intersection inter = new Intersection();
        System.out.println(inter.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
        System.out.println(inter.intersection(new int[]{4, 6, 11, 2, 3}, new int[]{5, 11, 3, 9, 1}));

        System.out.println(inter.intersectionFast(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
        System.out.println(inter.intersectionFast(new int[]{4, 6, 11, 2, 3,15}, new int[]{5, 11, 3, 9, 1}));
    }
}
