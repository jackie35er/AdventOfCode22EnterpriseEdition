package org.jackie35er.common.factory.implementation

import org.jackie35er.common.domain.Path
import org.jackie35er.common.factory.FileReaderFactory
import java.io.FileReader


class SimpleFileReaderFactoryImplementation(private val path: Path) : FileReaderFactory {

    override fun createFileReader(): FileReader {
        val `pathAsNormalString🤮🤮🤮`= path.pathToFile.value //🤮

        return FileReader(`pathAsNormalString🤮🤮🤮`) //Stoopid FileReader only takes a String, not a highly abstracted Path
    }
}
