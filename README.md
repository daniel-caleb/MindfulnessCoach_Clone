# Mindfulness Coach Clone

This project is a clone of a mindfulness coaching app built using Jetpack Compose for the Android platform.

## Overview

The app consists of a homepage that includes a header with icons, a large image, and several cards representing different mindfulness activities. This README outlines the recent changes made to ensure the UI components fill the screen and are aligned properly.

## Changes Made

### 1. Top-level Column
- **Added Modifier**: `Modifier.fillMaxSize()` to ensure the top-level column takes up the full screen.
- **Added Padding**: `padding(16.dp)` to add some spacing around the content.

### 2. Header Row
- **Modified Icons and Text Alignment**:
    - Applied `weight(1f)` to the icons on the left and right to make the text centered.
    - Applied `weight(6f)` to the text to ensure it takes more space and centers correctly.

### 3. Image Box
- **Added Modifier**: `Modifier.weight(1f)` to ensure the box containing the image takes up the remaining space after the header.

### 4. Activity Cards
- **Ensured Equal Sizing and Spacing**:
    - Added `weight(1f)` to each card to distribute space evenly within rows.
    - Added `padding(8.dp)` for spacing around each card.
    - Added `aspectRatio(1f)` to ensure each card is square.

- **Centered Content in Cards**:
    - Wrapped card content inside a `Column` with `verticalArrangement = Arrangement.Center` and `horizontalAlignment = Alignment.CenterHorizontally` to center the content vertically and horizontally.
