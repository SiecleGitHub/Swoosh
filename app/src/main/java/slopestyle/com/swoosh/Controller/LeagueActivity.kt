package slopestyle.com.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import slopestyle.com.swoosh.R
import slopestyle.com.swoosh.Utilities.EXTRA_LEAGUE

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if(selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View) {
      womensLeagueBtn.isChecked = false
      coedLeagueBtn.isChecked = false
      selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
      mensLeagueBtn.isChecked = false
      coedLeagueBtn.isChecked = false
      selectedLeague = "womens"
    }

    fun onCoedClicked(view: View) {
      mensLeagueBtn.isChecked = false
      womensLeagueBtn.isChecked = false
      selectedLeague = "co-ed"
    }
}