
<?php
//Find Second Largest Number in Array Without Sorting
$arr = [12, 43, 13, 54, 11];
$max = $arr[0];
$sec_max = $arr[1];

foreach ($arr as $element) {
    if ($element > $max) {
        $sec_max = $max;
        $max = $element;
    } elseif ($element > $sec_max && $element != $max) {
        $sec_max = $element;
    }
}

echo "Second Largest Element Without Sorting: $sec_max\n";
?>
