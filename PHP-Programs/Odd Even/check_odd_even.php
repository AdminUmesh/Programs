<html>

<head>Check Odd Even</head>

<body>
    <form method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <label for="input">Enter your input:</label>
        <input type="number" name="Num" id="input">
        <input type="submit" value="Submit">
    </form>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST" && !empty($_REQUEST['Num'])) {

        $Num = $_REQUEST['Num'];
        if ($Num % 2 == 0) {
            echo "Even Number";
        } else {
            echo "Odd Number";
        }
    }
    ?>
</body>

</html>