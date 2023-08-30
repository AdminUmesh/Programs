<html>
<head>Check Leap Year</head>
<body>
<form method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <label for="input">Enter your input:</label>
        <input type="number" name="Num" id="input">
        <input type="submit" value="Submit">
</form>
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST" && !empty($_REQUEST['Num'])) {
function LeapYear($Num){
    if($Num % 4 == 0){
        if($Num % 100 == 0 && $Num % 400 != 0){
            return false;
        }else{
            return true;
        }
    }
}
$Num=$_REQUEST['Num'];
if(LeapYear($Num)==true){
    echo "Leap Year";
}else{
    echo "Not a Leap Year";
}
}
?>
</body>
</html>