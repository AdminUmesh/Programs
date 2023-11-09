<?php
// Print only Non-Repeating Element from Array
function findNonRepeating($arr) {
    $counts = array_count_values($arr);
    
    foreach ($counts as $element => $count) {
        if ($count == 1) {
            echo $element . ' ';
        }
    }
}

// Example usage:
$array = [1, 2, 3, 4, 2, 1, 5, 6, 6];
findNonRepeating($array);
?>