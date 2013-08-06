<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Sistema QualySys</title>
<script src="SpryAssets/SpryValidationTextField.js" type="text/javascript"></script>
<script src="SpryAssets/SpryValidationPassword.js" type="text/javascript"></script>
<link href="SpryAssets/SpryValidationTextField.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryValidationPassword.css" rel="stylesheet" type="text/css" />
</head>

<body>
<form id="form2" name="form2" method="post" action="LoginServlet">
  <p>
    <label for="login">Login</label>
    : 
    <span id="sprytextfield1">
    <input name="usuario" type="text" id="login" maxlength="8" />
  <span class="textfieldRequiredMsg">Login Necessário!</span></span> </p>
  <p>
    <label for="senha">Senha :</label>
    <span id="sprypassword1">
    <input name="senha" type="password" id="senha" maxlength="8" />
    <span class="passwordRequiredMsg">Senha Necessária!</span></span></p>
  <p>
    <input type="submit" name="ok" id="enviar" value="Enviar" />
  </p>
</form>
<script type="text/javascript">
var sprytextfield1 = new Spry.Widget.ValidationTextField("sprytextfield1", "none", {validateOn:["blur", "change"]});
var sprypassword1 = new Spry.Widget.ValidationPassword("sprypassword1", {validateOn:["blur", "change"]});
</script>
</body>
</html>
