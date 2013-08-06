<%-- 
    Document   : AdicionaUsuario
    Created on : 27/05/2013, 05:14:58
    Author     : Renann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Incluir - Entrevistado</title>
    <script src="SpryAssets/SpryValidationTextField.js" type="text/javascript"></script>
    <script src="SpryAssets/SpryValidationSelect.js" type="text/javascript"></script>
    <script src="SpryAssets/SpryValidationRadio.js" type="text/javascript"></script>
    <link href="SpryAssets/SpryValidationTextField.css" rel="stylesheet" type="text/css">
    <link href="SpryAssets/SpryValidationSelect.css" rel="stylesheet" type="text/css">
    <link href="SpryAssets/SpryValidationRadio.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <form method="post" action="AdicionarUsuarioServlet">
          <p>Nome:
            <span id="sprytextfield1">
            <input type="text" name="nome" />
            <span class="textfieldRequiredMsg">Nome Necessário!</span></span><br />
            Data de Nascimento: <span id="sprytextfield2">
            <input type="text" name="data_n" />
            <span class="textfieldRequiredMsg">Data de Nascimento Necessária!</span><span class="textfieldInvalidFormatMsg">Formato inválido.</span></span><br />
            Pratica Atividade Física ? :<span id="spryselect1">
            <label for="select1"></label>
            <span class="selectRequiredMsg">Selecione um item.</span></span><span id="spryradio1">
            <label>
              <input type="radio" name="prat_f" value="1" id="prat_f_0">
              Sim</label>
            
            <label>
              <input type="radio" name="prat_f" value="0" id="prat_f_1">
              Não</label>
           
            <span class="radioRequiredMsg">Faça uma seleção.</span></span><br />
            Tipo de Atividade Física: <span id="sprytextfield3">
            <input type="text" name="tipo_atv" />
            <span class="textfieldRequiredMsg">Tipo de Atividade Física Necessária!</span></span><br />  
            Telefone: <span id="sprytextfield4">
            <input type="text" name="tel" />
            <span class="textfieldRequiredMsg">Telefone Necessário!</span><span class="textfieldInvalidFormatMsg">Formato inválido.</span></span><br />
            Endereço: <span id="sprytextfield5">
            <input type="text" name="ender" />
            <span class="textfieldRequiredMsg">Endereço Necessário!</span></span><br />
            Bairro: <span id="sprytextfield6">
            <input type="text" name="bairro" />
            <span class="textfieldRequiredMsg">Bairro Necessário!</span></span><br />
            Cidade: <span id="sprytextfield7">
            <input type="text" name="cidade" />
            <span class="textfieldRequiredMsg">Cidade Necessária!</span></span><br />
            Estado: <span id="sprytextfield8">
            <input type="text" name="estado" />
            <span class="textfieldRequiredMsg">Estado Necessário!</span></span><br />
            País: <span id="sprytextfield9">
            <input type="text" name="pais" />
            <span class="textfieldRequiredMsg">País Necessário!</span></span><br />
            Sexo: <span id="spryradio2">
            <label>
              <input type="radio" name="sexo" value="masculino" id="sexo_0">
              Masculino</label>
            
            <label>
              <input type="radio" name="sexo" value="feminino" id="sexo_1">
              Feminino</label>
            
            <span class="radioRequiredMsg">Faça uma seleção.</span></span><br />
            E-mail: <span id="sprytextfield10">
            <input type="text" name="e-mail" />
            <span class="textfieldRequiredMsg">Digite o e-mail!</span><span class="textfieldInvalidFormatMsg">E-mail Inválido!</span></span><br />            
            <input type="submit" value="Gravar" />
            <input type="reset" name="button" value="Limpar">
    </form>
    <script type="text/javascript">
var sprytextfield1 = new Spry.Widget.ValidationTextField("sprytextfield1");
var sprytextfield2 = new Spry.Widget.ValidationTextField("sprytextfield2", "date", {format:"dd/mm/yyyy", hint:"dd/mm/aaaa"});
var spryselect1 = new Spry.Widget.ValidationSelect("spryselect1");
var spryradio1 = new Spry.Widget.ValidationRadio("spryradio1");
var sprytextfield3 = new Spry.Widget.ValidationTextField("sprytextfield3");
var sprytextfield4 = new Spry.Widget.ValidationTextField("sprytextfield4", "custom", {pattern:"(00) 0000-0000", useCharacterMasking:true});
var sprytextfield5 = new Spry.Widget.ValidationTextField("sprytextfield5");
var sprytextfield6 = new Spry.Widget.ValidationTextField("sprytextfield6");
var sprytextfield7 = new Spry.Widget.ValidationTextField("sprytextfield7");
var sprytextfield8 = new Spry.Widget.ValidationTextField("sprytextfield8");
var sprytextfield9 = new Spry.Widget.ValidationTextField("sprytextfield9");
var spryradio2 = new Spry.Widget.ValidationRadio("spryradio2");
var sprytextfield10 = new Spry.Widget.ValidationTextField("sprytextfield10", "email");
    </script>
    </body>
</html>
