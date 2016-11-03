package com.github.odiszapc.common.formatter;

import com.github.odiszapc.nginxparser.NgxEntry;
import com.github.odiszapc.nginxparser.NgxEntryType;

/**
 *
 * <p>
 * formatter for NgxEntry
 * </p>
 * @author ${Author}
 * @version ${Version}
 * @since 8.1.0
 *
 */
public interface EntryFormatter{

    StringBuffer formattedText(NgxEntry entry);

    NgxEntryType[] supportedEntryTypes();
}
