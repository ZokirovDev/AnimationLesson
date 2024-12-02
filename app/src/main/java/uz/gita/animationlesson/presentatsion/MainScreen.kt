package uz.gita.animationlesson.presentatsion

import android.animation.Animator
import android.animation.ValueAnimator
import android.graphics.Color
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.animationlesson.R
import uz.gita.animationlesson.databinding.ScreenMainBinding

@AndroidEntryPoint
class MainScreen : Fragment(R.layout.screen_main) {
    private val binding: ScreenMainBinding by viewBinding<ScreenMainBinding>()
    private val viewModel: MainScreenViewModel by viewModels()

    //1. View animator
    //2. Value animator
    //3. Object animator
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnRun.setOnClickListener {
            val anim = ValueAnimator.ofFloat(0f,100f)
            anim.addUpdateListener { binding.btnTest.y-=anim.animatedValue as Float }
            anim.interpolator = BounceInterpolator()
            anim.duration = 200
            anim.start()
            ValueAnimator.ofArgb(Color.parseColor("#ffffff"), Color.parseColor("#000000")).apply {
                duration = 3000
                addUpdateListener { binding.btnTest.setBackgroundColor(it.animatedValue as Int) }
                start()
            }

            /*
            |-------------------------------------------|
                                 100f
                 t = 200ms
                 s = 100f
                 v = 100/200

             */
        }
    }

}