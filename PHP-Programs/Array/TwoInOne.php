<?php
//Two sorted array store in one array(in sorted array From).
$a1 = [11, 34, 66, 75];
$a2 = [1, 5, 19, 50, 89, 100];
$b = array_merge($a1, $a2);

sort($b);

echo '[' . implode(', ', $b) . ']';
?>
