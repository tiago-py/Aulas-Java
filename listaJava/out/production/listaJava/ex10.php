
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exercicio 10</title>
</head>
<body>
    <?php
        //não entendi o motivo do exercicio em PHP na lista de Java mas fiz mesmo assim
        if(isset($_POST=['password'])){
            $password = $_POST['password'];
            if($password == '2149'){
                echo "open";
            }else{
                echo "error password";
            }
        }
    ?>
    <form method="post" action="">
    Senha: <input type="password" name="password"><br><br>
    <input type="submit" value="Enviar">
</form>

</body>
</html>