package edu.uksw.fti.pam.acitivityintent.ui

import edu.uksw.fti.pam.acitivityintent.R

data class ImageBanner(
    val imgUri:Int
)

val ImageBannerList = listOf(
    ImageBanner(
        R.drawable.onepiecebanner
    ),
    ImageBanner(
        R.drawable.jujutsubanner
    ),
    ImageBanner(
        R.drawable.kimetsubanner
    )
)