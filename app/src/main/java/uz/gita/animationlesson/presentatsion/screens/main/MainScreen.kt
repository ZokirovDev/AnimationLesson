package uz.gita.animationlesson.presentatsion.screens.main

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageView
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.animationlesson.R
import uz.gita.animationlesson.databinding.ScreenMainBinding
import uz.gita.animationlesson.core.utils.isFinishListener

@AndroidEntryPoint
class MainScreen : Fragment(R.layout.screen_main) {
    private val binding: ScreenMainBinding by viewBinding<ScreenMainBinding>()
    private val viewModel: MainScreenViewModel by viewModels()
    private var isOpen = false


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.imgCard1.setOnClickListener { image ->
            if (!isOpen)
                binding.imgCard1.openCard()
            else binding.imgCard1.closeCard()
        }


    }

    private fun ImageView.openCard() {
        animate().apply {
            rotationY(89f)
            isFinishListener {
                binding.imgCard1.setImageResource(R.drawable.img_1)
                this@openCard.rotationY = 271f
                animate().rotationY(360f)
                    .isFinishListener {
                        isOpen = true
                    }
                    .start()
            }
            start()
        }
    }

    private fun ImageView.closeCard() {
        animate().apply {
            rotationY(271f)
            isFinishListener {
                binding.imgCard1.setImageResource(R.drawable.img_bg_card)
                this@closeCard.rotationY = 89f
                animate().rotationY(0f)
                    .isFinishListener {
                        isOpen = false
                    }
                    .start()
            }
            start()
        }
    }

}