package com.adam.gradle.plugin;


import com.android.build.gradle.AppExtension;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;

public class AdamPlugin implements Plugin<Project> {

    @Override
    public void apply(@NotNull Project project) {
        AppExtension appExtension = project.getExtensions().findByType(AppExtension.class);
        appExtension.registerTransform(new AdamTransform(), Collections.emptyList());
    }

}