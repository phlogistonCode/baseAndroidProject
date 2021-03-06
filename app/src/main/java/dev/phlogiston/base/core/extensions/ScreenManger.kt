package dev.phlogiston.base.core.extensions

import android.app.Activity
import android.content.Intent
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

// Activity

fun AppCompatActivity.addFragment(fragment: Fragment, container: ViewGroup, tag: String? = null) {
    supportFragmentManager
        .beginTransaction()
        .add(container.id, fragment, tag)
        .commit()
}

fun AppCompatActivity.addHideFragment(fragment: Fragment, container: ViewGroup, tag: String? = null) {
    supportFragmentManager
        .beginTransaction()
        .add(container.id, fragment, tag)
        .hide(fragment)
        .commit()
}

fun AppCompatActivity.hideFragment(fragment: Fragment) {
    supportFragmentManager
        .beginTransaction()
        .hide(fragment)
        .commit()
}

fun AppCompatActivity.showFragment(fragment: Fragment) {
    supportFragmentManager
        .beginTransaction()
        .show(fragment)
        .commit()
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, container: ViewGroup) {
    supportFragmentManager.beginTransaction()
        .replace(container.id, fragment)
        .commit()
}

fun AppCompatActivity.detachFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .detach(fragment)
        .commit()
}

fun AppCompatActivity.attachFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .attach(fragment)
        .commit()
}

fun AppCompatActivity.replaceActivity(activity: Activity) {
    finish()
    startActivity(Intent(this, activity::class.java))
}

fun AppCompatActivity.toActivity(activity: Activity) {
    startActivity(Intent(this, activity::class.java))
}

// Fragment

fun Fragment.addChildFragment(fragment: Fragment, container: ViewGroup, tag: String? = null) {
    childFragmentManager
        .beginTransaction()
        .add(container.id, fragment, tag)
        .commit()
}

fun Fragment.addHideChildFragment(fragment: Fragment, container: ViewGroup, tag: String? = null) {
    childFragmentManager
        .beginTransaction()
        .add(container.id, fragment, tag)
        .hide(fragment)
        .commit()
}

fun Fragment.hideChildFragment(fragment: Fragment) {
    childFragmentManager
        .beginTransaction()
        .hide(fragment)
        .commit()
}

fun Fragment.showChildFragment(fragment: Fragment) {
    childFragmentManager
        .beginTransaction()
        .show(fragment)
        .commit()
}

fun Fragment.replaceChildFragment(fragment: Fragment, container: ViewGroup) {
    childFragmentManager.beginTransaction()
        .replace(container.id, fragment)
        .commit()
}

fun Fragment.detachChildFragment(fragment: Fragment) {
    childFragmentManager.beginTransaction()
        .detach(fragment)
        .commit()
}

fun Fragment.attachChildFragment(fragment: Fragment) {
    childFragmentManager.beginTransaction()
        .attach(fragment)
        .commit()
}

fun Fragment.replaceActivity(toActivity: Activity) {
    activity?.finish()
    startActivity(Intent(activity, toActivity::class.java))
}

fun Fragment.toActivity(toActivity: Activity) {
    startActivity(Intent(activity, toActivity::class.java))
}