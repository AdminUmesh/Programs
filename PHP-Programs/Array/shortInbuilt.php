<?php
//Sort the array without any inbuilt sorting algorithm
      $arr = [ 12, 4, 2, 65, 1, 61 ];
      for ($i = 0; $i < count($arr); $i++) {
          for ($j = $i + 1; $j < count($arr); $j++) {
              $temp = 0;
              if ($arr[$i] > $arr[$j]) {
                  $temp = $arr[$i];
                  $arr[$i] = $arr[$j];
                  $arr[$j] = $temp;
              }
          }
        }
        echo implode(", ",$arr);
?>