def stringRotation(str1, str2):
	if(len(str1) == len(str2)):
		if(str2 in str1 + str1):
			return True

	return False

print(stringRotation("california", "niacalifor"))