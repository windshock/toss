// entry=0x72e74

void H71578(void)

{
  int iVar1;
  uint uVar2;
  char cVar3;
  bool bVar4;
  ulong in_stack_00000058;
  
  memset(&stack0x00000264,0,0x100);
  memset(&stack0x00000164 +
         (-DAT_00276da8 | 0x1a0a294d3994d2a0U) + (-DAT_00276da8 & 0x1a0a294d3994d2a0U),0,0x100);
LAB_00178218:
  do {
    if (DAT_0029e5ec == 0) {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(0x29e5ec,0x10);
      if (bVar4) {
        DAT_0029e5ec = 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
      if (cVar3 != '\0') goto LAB_00178218;
      bVar4 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar4 = false;
    }
    if (bVar4) {
      uVar2 = (uint)((in_stack_00000058 & 0x1000000) == 0);
      iVar1 = (DAT_002862a0 ^ uVar2) + (DAT_002862a0 & uVar2) * 2;
      if (DAT_002862a0 !=
          (-(int)DAT_00276da8 | 0x3994d2a0U) * 2 - (-(int)DAT_00276da8 ^ 0x3994d2a0U)) {
        DAT_0029e5ec = 0;
        DAT_002862a0 = iVar1;
                    /* WARNING: Could not recover jumptable at 0x001717b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_002839b8)();
        return;
      }
      DAT_00283608 = 0x85dde69d75309ab9;
      DAT_00283610 = 0x65;
      DAT_002862a0 = iVar1;
                    /* WARNING: Could not recover jumptable at 0x00170a24. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00285ea8)(0);
      return;
    }
  } while( true );
}


