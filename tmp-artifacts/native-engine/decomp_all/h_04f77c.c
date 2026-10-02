// entry=0x4f77c

void H4f77c(char *param_1)

{
  char cVar1;
  
  do {
    cVar1 = *param_1;
    param_1 = param_1 + 1;
  } while (cVar1 != ' ');
                    /* WARNING: Could not recover jumptable at 0x001496e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275e30)();
  return;
}


