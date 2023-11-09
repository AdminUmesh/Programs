//Find the only one non-repeating element in array where every element repeats twice.

<?php
function findNonRepeating($arr) {
    $res = 0;
    foreach ($arr as $element) {
        $res ^= $element;
    }
    echo $res;
}

// Example usage:
$array = [5, 4, 1, 4, 3, 5, 1];
findNonRepeating($array);
?>
