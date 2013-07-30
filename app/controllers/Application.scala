package controllers
import com.typesafe.plugin._
import play.api.Play.current
import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
  	val mail = use[MailerPlugin].email
	mail.setSubject("mailer")
	mail.addRecipient("fares.droubi@gmail.com")
	mail.addFrom("fdr@zenexity.com")
	//sends text/text
	mail.send( "textf safaoifjdoiajfdsoijsf" )

    Ok(views.html.index("Your new application is ready."))
  }

  
}