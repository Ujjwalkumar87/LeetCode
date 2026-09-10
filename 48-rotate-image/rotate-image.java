class Solution {
    public void rotate(int[][] arr) {

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++){
            int l = 0;
            int r = arr[0].length - 1;
            while(l < r){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}
    


        // my method
         
        // transpose
//         for(int i = 0; i < arr.length; i++){
//              for(int j = 0; j < i; j++){
//               int temp = arr[i][j];
//               arr[i][j] = arr[j][i];
//               arr[j][i] = temp;
//             }
//       }

//         // reverse
//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < arr[0].length/2; j++){
//                   int temp = arr[i][j];
//                   arr[i][j] = arr[i][arr.length-1-j];
//                    arr[i][arr.length-1-j] = temp;
//             }
//          }
//      }
//  }


            // sir method
        
        // // transpose
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < i; j++){
        //         int temp = arr[i][j];
        //         arr[i][j] = arr[j][i];
        //         arr[j][i] = temp;
        //     }
        // }
        
        // // reverse
        // for(int i = 0; i < arr.length; i++){
        //    int stcol = 0;
        //    int enddcol = arr[0].length - 1;
        //    while(stcol < endcol){
        //     int temp = arr[i][stcol];
        //     arr[i][stcol] = arr[i][endcol];
        //     arr[i][eencol] = temp;
        //     stcol++;
        //     endcol--;
        //    }
        //  }
    //     }
    // }

