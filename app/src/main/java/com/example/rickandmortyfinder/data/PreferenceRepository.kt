package com.example.rickandmortyfinder.data

import com.example.rickandmortyfinder.db.PreferenceDao
import com.example.rickandmortyfinder.model.Preference

class PreferenceRepository(private val dao: PreferenceDao) {
    suspend fun getPreference(): Preference {
        return dao.getPreference(0) ?: run {
            val newPreference = Preference(
                id = 0,
                showOnBoarding = true
            )
            dao.insertPreference(newPreference)
            newPreference
        }
    }

    suspend fun disableOnBoarding() {
        val pref = getPreference()
        dao.updatePreference(
            pref.copy(
                showOnBoarding = false
            )
        )
    }
}