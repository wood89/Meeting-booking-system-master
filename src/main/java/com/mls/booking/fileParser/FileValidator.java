package com.mls.booking.fileParser;

import com.mls.booking.errors.InvalidFormatException;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.IOException;

public interface FileValidator {

    /**
     * Validate the input file with the defined rules. If validates then return true otherwise false.
     *
     * @param file input file to be validated
     * @return true | false
     * @throws IOException
     * @throws InvalidFormatException
     */
    @Nonnull
    boolean validateFileFormat(@Nonnull File file) throws IOException, InvalidFormatException;
}
