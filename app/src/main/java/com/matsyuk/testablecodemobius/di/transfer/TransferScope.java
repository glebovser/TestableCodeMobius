package com.matsyuk.testablecodemobius.di.transfer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author e.matsyuk
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface TransferScope {
}
