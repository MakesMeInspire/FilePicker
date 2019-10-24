package com.senjacreative.picker.cursors.loadercallbacks

import com.senjacreative.picker.models.Document
import com.senjacreative.picker.models.FileType

/**
 * Created by gabriel on 10/2/17.
 */

interface FileMapResultCallback {
    fun onResultCallback(files: Map<FileType, List<Document>>)
}

