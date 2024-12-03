package uz.gita.animationlesson.core.utils

import android.animation.Animator
import android.view.ViewPropertyAnimator

fun ViewPropertyAnimator.isFinishListener(bloc: (Animator) -> Unit): ViewPropertyAnimator {
    setListener(object : Animator.AnimatorListener {
        override fun onAnimationStart(p0: Animator) {}

        override fun onAnimationEnd(p0: Animator) { bloc(p0) }

        override fun onAnimationCancel(p0: Animator) {}

        override fun onAnimationRepeat(p0: Animator) {}

    })
    return this
}