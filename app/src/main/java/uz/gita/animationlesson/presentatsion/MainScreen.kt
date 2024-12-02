package uz.gita.animationlesson.presentatsion

import android.animation.Animator
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
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
            val anim = binding.btnTest.animate().apply {
                setListener(object : Animator.AnimatorListener{
                    override fun onAnimationStart(p0: Animator) {

                    }

                    override fun onAnimationEnd(p0: Animator) {
                        TODO("Not yet implemented")
                    }

                    override fun onAnimationCancel(p0: Animator) {
                        TODO("Not yet implemented")
                    }

                    override fun onAnimationRepeat(p0: Animator) {
                        TODO("Not yet implemented")
                    }

                })
            }
//            anim.rotationY(binding.btnTest.rotationY+45f)
//            anim.translationX(binding.btnTest.x+10f)
//            anim.scaleX(1.5f)
//            anim.scaleY(1.5f)
//            anim.rotation(45f)
            anim.duration = 300
            anim.start()
        }
    }

}