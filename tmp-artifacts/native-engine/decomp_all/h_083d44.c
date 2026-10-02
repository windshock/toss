// entry=0x83d44

void H83d44(void *param_1,void *param_2,size_t param_3)

{
  memcpy(param_1,param_2,param_3);
                    /* WARNING: Could not recover jumptable at 0x00180ff0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00274330)();
  return;
}


