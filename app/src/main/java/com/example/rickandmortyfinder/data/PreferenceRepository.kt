package com.example.rickandmortyfinder.data

import com.example.rickandmortyfinder.db.PreferenceDao
import com.example.rickandmortyfinder.model.Preference

class PreferenceRepository(private val dao: PreferenceDao) {
    suspend fun getPreference(): Preference {
        return dao.getPreference(0) ?: Preference().also { dao.insertPreference(it) }
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