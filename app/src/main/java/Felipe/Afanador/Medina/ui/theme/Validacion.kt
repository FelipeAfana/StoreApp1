package Felipe.Afanador.Medina.ui.theme

import android.util.Patterns


fun validarEmail(email:String):Pair<Boolean,String> {
    return when {
        email.isEmpty()->Pair(false, "Correo requerido")
        !email.endsWith("@unab.edu.co")->Pair(false, "Solo correos de la unab")
        !Patterns.EMAIL_ADDRESS.matcher(email).matches()->Pair(false,"Solo correos validos")
        else ->{
            Pair(true,"")
        }
    }
}

fun validarPasword(pasword:String):Pair<Boolean,String>{
    return when{
        pasword.isEmpty()->Pair(false, "Contraseña requerida")
        pasword.length <8 -> Pair(false,"La contraseña tiene que ser mas de 8 caracteres")
        else {
            Pair(true,"")
        }
    }
}