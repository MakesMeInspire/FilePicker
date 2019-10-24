package com.senjacreative.picker.utils

import android.content.ContentResolver
import android.os.Bundle

import java.util.Comparator

import com.senjacreative.picker.cursors.DocScannerTask
import com.senjacreative.picker.cursors.PhotoScannerTask
import com.senjacreative.picker.cursors.loadercallbacks.FileMapResultCallback
import com.senjacreative.picker.cursors.loadercallbacks.FileResultCallback
import com.senjacreative.picker.models.Document
import com.senjacreative.picker.models.FileType
import com.senjacreative.picker.models.PhotoDirectory

object MediaStoreHelper {

    fun getDirs(contentResolver: ContentResolver, args: Bundle, resultCallback: FileResultCallback<PhotoDirectory>) {
        PhotoScannerTask(contentResolver,args,resultCallback).execute()
    }

    fun getDocs(contentResolver: ContentResolver,
                fileTypes: List<FileType>,
                comparator: Comparator<Document>?,
                fileResultCallback: FileMapResultCallback) {
        DocScannerTask(contentResolver, fileTypes, comparator, fileResultCallback).execute()
    }
}