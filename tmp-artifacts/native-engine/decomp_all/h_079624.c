// entry=0x79624

void FUN_00179624(void)

{
  long lVar1;
  undefined1 auStack_490 [256];
  undefined1 local_390;
  undefined1 local_360;
  undefined1 *local_298;
  undefined8 local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(undefined8 *)(lVar1 + 0x28);
  local_360 = 0;
  local_390 = 0;
  local_298 = auStack_490;
                    /* WARNING: Could not recover jumptable at 0x0017ac84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275fc8)();
  return;
}


