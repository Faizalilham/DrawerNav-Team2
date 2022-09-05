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
                R.id.kotak_masuk -> Toast.makeText(this,"Pesan Web Terklik", Toast.LENGTH_SHORT).show()
                R.id.utama -> Toast.makeText(this,"Group Terklik", Toast.LENGTH_SHORT).show()
                R.id.social -> Toast.makeText(this,"Setelan Terklik", Toast.LENGTH_SHORT).show()
                R.id.promosi -> Toast.makeText(this,"Bagikan Terklik", Toast.LENGTH_SHORT).show()
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
