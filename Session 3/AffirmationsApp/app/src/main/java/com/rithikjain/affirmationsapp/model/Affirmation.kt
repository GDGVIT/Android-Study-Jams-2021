package com.rithikjain.affirmationsapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@DrawableRes val imageResourceID: Int, @StringRes val stringResourceID: Int)