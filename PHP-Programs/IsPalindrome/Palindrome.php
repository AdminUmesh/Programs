<html>
<head>Check palidrome</head>
<body>
<form method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <label for="input">Enter your input:</label>
        <input type="text" name="str" id="input">
        <input type="submit" value="Submit">
</form>
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
function palindrome($string)
{	
 for($i=strlen($string)-1,$j=0;$j<$i;$i--,$j++)
 {
 	$temp=$string[$i];
 	$string[$i]=$string[$j];
	$string[$j]=$temp;
 }
 return $string;
}
$string1=$_REQUEST["str"];
if($string1==palindrome($string1))
{
	echo "Palindrome Number";
}
else
{
	echo "Not a Palindrome Number";
}
}
?>
</body>
</html>