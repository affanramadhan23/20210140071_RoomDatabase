package com.example.datasiswa.ui.theme.halaman

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.datasiswa.Destinasi.DestinasiNavigasi
import com.example.datasiswa.R
import com.example.datasiswa.model.DetailSiswa
import com.example.datasiswa.model.EntryViewModel
import com.example.datasiswa.model.PenyediaViewModel
import com.example.datasiswa.model.UIStateSiswa

object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntrySiswaScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EntryViewModel = viewModel(factory = PenyediaViewModel.Factory)
){
    val coroutineScope = rememberCoroutineScope()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

}

@Composable
fun EntrySiswaBody(

    uiStateSiswa: UIStateSiswa,
    onSiswaValueChange: (DetailSiswa) ->Unit,
    onSaveClick: () -> Unit,
    modifier: Modifier = Modifier
){

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputSiswa(

){

}
