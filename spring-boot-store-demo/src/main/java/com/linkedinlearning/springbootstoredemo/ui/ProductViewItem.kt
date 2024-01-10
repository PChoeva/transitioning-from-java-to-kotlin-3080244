package com.linkedinlearning.springbootstoredemo.ui

import java.util.*

/**
 * A UI-facing representation of a [com.linkedinlearning.springbootstoredemo.model.Product]
 */
data class ProductViewItem(
        var name: String,
        var description: String,
        var thumbnail: String,
        var displayDetails: String
)