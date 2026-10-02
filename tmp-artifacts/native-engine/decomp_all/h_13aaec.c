// entry=0x13aaec

void H13aaec(code *param_1)

{
  int iVar1;
  
  iVar1 = (*param_1)();
                    /* WARNING: Could not recover jumptable at 0x0023ab08. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00279878)(iVar1 == 0);
  return;
}


