Unit 8: Group Milestone - README
===

# Habits Tracker

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

## Overview
### Description
An app that keeps track of your habits. A habit could be a task you want to have reminders for so that you do it daily or x amount of times. A thing like drinking water or taking breaks at certain times.

### App Evaluation
- **Category:** Productivity
- **Mobile:** This app would be primarily developed for mobile however it could be equally used on a computer. The functionality could be shared between the mobile and computer devices.
- **Story:** A user creates a few habits they want to keep track of which the app will remind and enables the user to keep updating the records of doing the habit and repeats for x number of days chosen by the user.
- **Market:** Any individual can choose to use this app.
- **Habit:** This app can be used as daily as the user wants depending on their use cases.
- **Scope:** First get started by having the user be able to track a habit through daily reminders based on the user’s preferences. Then having them be able to input more habits which could then be paired into sections of habits to notify them all at once instead of individually.
## Product Spec
### 1. User Stories (Required and Optional)

**Required Must-have Stories**

*[x] User has their own account which tracks their habits
*[] User can create new habits, a task item they wish to complete on a set schedule
*[x] User can view all previously created habits
*[] User can confirm they completed a habit for the day
*[] Settings (Accesibility, Notification, General, etc.)

**Optional Nice-to-have Stories**

* User can look at a visualization dashboard for each habit
* User can see a calendar of previously completed habits
* User can opt-in to receive notification to complete a habit

### 2. Screen Archetypes

* Login - User signs up or logs into their account
   * Upon Download/Reopening of the application, the user is prompted to log in to gain access to their profile information to be properly matched with another person. 
* Compose Screen
   * Create new tasks
   * Update tasks
* Home Screen
   * lists out the tasks
   * delete tasks
* Settings Screen
   * app notification settings.

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Habit Dashboard
* Compose habits
* Settings

Optional:
* Habit Analytics

**Flow Navigation** (Screen to Screen)
* Forced Log-in -> Account creation if no log in is available
* Habit Dashboard -> Displays habits and compose new habit
* Compose habits -> Text field to be modified for task and recurring time schedule selection. 
* Settings -> Toggle settings


## Wireframes
<img src="https://github.com/YueLi1996/Habits-Tracker/blob/bf938a8d460bee552b34f2db58bbab0031d19fe5/HabitTrackerWireFrame.png" width="1000">

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

### Schema
## Models
User
| Property | Type | Description |
| --- | --- | --- |
| objectId | String | unique id for user (default) |
| createdAt | DateTime | date when user is created (default field) |
| updatedAt | DateTime | date when user is last updated (default field) |
| username | String | login username |
| password | String | login password |

Habit
| Property | Type | Description |
| --- | --- | --- |
| objectId | String | unique id for habit (default) |
| createdAt | DateTime | date when user is created (default field) |
| updatedAt | DateTime | date when user is last updated (default field) |
| user | Object | user who is keeping track of habit |
| name | String | habit name |
| description | String | habit description |
| repeatDays | Int | frequency every n number of days |
| repeatTime | Int | frequency every n times per day |
| startTime | Int | start time for period of repeat notifications |
| endTime | Int | end time for period of repeat notifications |
| progressSoFar | Int | number of repeatTime completed |
| completed | Int | number of times habit has been completed |

