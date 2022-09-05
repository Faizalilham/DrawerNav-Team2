package com.example.drawernavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.drawernavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var toogle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setDrawerNav()
    }

    private fun setDrawerNav(){
        toogle = ActionBarDrawerToggle(this,binding.drawerLayout,R.string.open,R.string.close)
        binding.drawerLayout.addDrawerListener(toogle)
        toogle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.drawerNavView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.kotak_masuk -> Toast.makeText(this,"All In Box Terklik", Toast.LENGTH_SHORT).show()
                R.id.utama -> Toast.makeText(this,"Primary Terklik", Toast.LENGTH_SHORT).show()
                R.id.social -> Toast.makeText(this,"Social Terklik", Toast.LENGTH_SHORT).show()
                R.id.promosi -> Toast.makeText(this,"Promotions Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuStarred -> Toast.makeText(this,"Starred Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuSnoozed -> Toast.makeText(this,"Snoozed Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuImportant -> Toast.makeText(this,"Important Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuSent -> Toast.makeText(this,"Send Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuScheduled -> Toast.makeText(this,"Scheduled Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuOutbox -> Toast.makeText(this,"Outbox Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuDrafts -> Toast.makeText(this,"Drafts Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuAllMails -> Toast.makeText(this,"AllMails Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuSpam -> Toast.makeText(this,"MenuSpam Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuBin -> Toast.makeText(this,"MenuBin Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuJunk -> Toast.makeText(this,"MenuJunk Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuCalendar -> Toast.makeText(this,"MenuCalender Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuContacs -> Toast.makeText(this,"menuContacs Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuSettings -> Toast.makeText(this,"MenuSetting Terklik", Toast.LENGTH_SHORT).show()
                R.id.menuHelpFeedback-> Toast.makeText(this,"MenuHelpFeedback Terklik", Toast.LENGTH_SHORT).show()


            }
                true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
