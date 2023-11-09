<?php
//Write a Java Program to find the second-highest number in an array.
  $arr = [ 12, 43, 23, 11, 54, 16 ];
      $SecondMax = 0;
      $Max = 0;
      $Len = count($arr);
      for ($i = 0; $i < $Len; $i++) {
          if ($arr[$i] > $Max) {
              $SecondMax = $Max;
              $Max = $arr[$i];
          } elseif ($arr[$i] > $SecondMax) {
              $SecondMax = $arr[$i];
          }
      }
      echo "Second height number in array are:  $SecondMax\n";
      echo "largest number in the array are:  $Max\n";
?>



<!-- <?php
// another way
$array = [12, 43, 23, 11, 54, 16];
$secondMax = $max = PHP_INT_MIN;
$len = count($array);

foreach ($array as $element) {
    if ($element > $max) {
        $secondMax = $max;
        $max = $element;
    } elseif ($element > $secondMax) {
        $secondMax = $element;
    }
}

echo "Second highest number in the array is: $secondMax\n";
echo "Largest number in the array is: $max\n";
?> -->
