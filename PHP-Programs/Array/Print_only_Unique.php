// Print only unique value from Array

<?php
$array = [1, 2, 3, 2, 4, 5, 3, 6, 7, 7];

// Create an associative array to store unique elements
$uniqueArray = [];

// Iterate through the original array and add elements to the associative array
foreach ($array as $element) {
    $uniqueArray[$element] = true;
}

// Print the unique elements from the associative array
echo "Unique elements in the array are:\n";
foreach (array_keys($uniqueArray) as $uniqueElement) {
    echo $uniqueElement . "\n";
}
?>

