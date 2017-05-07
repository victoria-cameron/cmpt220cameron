public class Location {
  //needed data fields
  int row;
  int column;
  double maxValue;

//Locates the largest value
  Location(double[][] a) {
  maxValue = a[0][0];
  row = 0;
  column = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > maxValue) {
          maxValue = a[i][j];
          row = i;
          column = j;
        }
      }
    }
  }
}