// entry=0x6bb78

void FUN_0016bb78(void)

{
  byte *pbVar1;
  uint uVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  long lVar7;
  long lVar8;
  
  lVar7 = tpidr_el0;
  lVar7 = *(long *)(lVar7 + 0x28);
LAB_0016bc0c:
  do {
    if (DAT_00286318 == 0) {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(0x286318,0x10);
      if (bVar4) {
        DAT_00286318 = 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
      if (cVar3 != '\0') goto LAB_0016bc0c;
      bVar4 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar4 = false;
    }
    if (bVar4) {
      lVar8 = (-DAT_00275930 | 0x5ddc6018f7e8b5deU) * 2 - (-DAT_00275930 ^ 0x5ddc6018f7e8b5deU);
      iVar5 = (int)DAT_00275930;
      uVar6 = (-iVar5 | 0x8342277aU) + (-iVar5 & 0x8342277aU);
      if ((DAT_00278c88 & 1) == 0) {
        DAT_00286318 = 0;
        CallSupervisor(0);
        lVar8 = tpidr_el0;
        if (*(long *)(lVar8 + 0x28) != lVar7) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail((-DAT_00275930 | 0x5ddc6018f7e8b57aU) * 2 -
                           (-DAT_00275930 ^ 0x5ddc6018f7e8b57aU),&DAT_0027a318,
                           (-DAT_00275930 ^ 0x5ddc6018f7e8b5deU) +
                           (-DAT_00275930 & 0x5ddc6018f7e8b5deU) * 2,
                           (-DAT_00275930 | 0x5ddc6018f7e8b5deU) +
                           (-DAT_00275930 & 0x5ddc6018f7e8b5deU));
        }
        return;
      }
      do {
        pbVar1 = &DAT_0027a318 +
                 (lVar8 << (0x5ddc6018f7e8b5df - (-DAT_00275930 ^ 0xffffffffffffffffU) & 0x3f));
        uVar2 = ((uint)pbVar1[0x5ddc6018f7e8b5de - (-DAT_00275930 ^ 0xffffffffffffffffU)] <<
                 (ulong)(0xb5e5 - (-iVar5 ^ 0xffffffffU) & 0x1f) | (uint)*pbVar1 |
                 (uint)pbVar1[(-DAT_00275930 | 0x5ddc6018f7e8b5e0U) +
                              (-DAT_00275930 & 0x5ddc6018f7e8b5e0U)] <<
                 (ulong)((-iVar5 | 0xf7e8b5eeU) * 2 - (-iVar5 ^ 0xf7e8b5eeU) & 0x1f) |
                (uint)pbVar1[(-DAT_00275930 | 0x5ddc6018f7e8b5e1U) +
                             (-DAT_00275930 & 0x5ddc6018f7e8b5e1U)] <<
                (ulong)(0xf7e8b5f5 - (-iVar5 ^ 0xffffffffU) & 0x1f)) *
                (0x53ba9f72 - (-iVar5 ^ 0xffffffffU));
        uVar6 = (uVar2 >> (ulong)((-iVar5 ^ 0xf7e8b5f6U) + (-iVar5 & 0xf7e8b5f6U) * 2 & 0x1f) ^
                uVar2) * (0x53ba9f72 - (-iVar5 ^ 0xffffffffU)) ^
                uVar6 * (0x53ba9f72 - (-iVar5 ^ 0xffffffffU));
        lVar8 = lVar8 + (-DAT_00275930 | 0x5ddc6018f7e8b5dfU) +
                        (-DAT_00275930 & 0x5ddc6018f7e8b5dfU);
      } while (lVar8 != 0x5ddc6018f7e8b5e1 - (-DAT_00275930 ^ 0xffffffffffffffffU));
      uVar6 = ((0xf7e8b5dd - (-iVar5 ^ 0xffffffffU) >>
                (ulong)(0xb5f5 - (-iVar5 ^ 0xffffffffU) & 0x1f) ^
               (-iVar5 | 0xf7e8b5deU) * 2 - (-iVar5 ^ 0xf7e8b5deU)) *
               (0x53ba9f72 - (-iVar5 ^ 0xffffffffU)) ^
              uVar6 * ((-iVar5 ^ 0x53ba9f73U) + (-iVar5 & 0x53ba9f73U) * 2)) *
              (0x53ba9f72 - (-iVar5 ^ 0xffffffffU)) ^
              (-iVar5 | 0xce4e01cfU) * 2 - (-iVar5 ^ 0xce4e01cfU);
      uVar6 = (uVar6 >> (ulong)((-iVar5 ^ 0xb5ebU) + (-iVar5 & 0xb5ebU) * 2 & 0x1f) ^ uVar6) *
              ((-iVar5 ^ 0x53ba9f73U) + (-iVar5 & 0x53ba9f73U) * 2);
      if ((uVar6 >> (ulong)((-iVar5 | 0xb5edU) + (-iVar5 & 0xb5edU) & 0x1f) ^ uVar6) == 0xec355c3c)
      {
                    /* WARNING: Could not recover jumptable at 0x0016c188. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_0027a130)(0);
        return;
      }
      *(undefined8 *)
       (((ulong)&stack0xfffffffffffffff0 | 8) * 2 - ((ulong)&stack0xfffffffffffffff0 ^ 8)) = 0x20;
      lVar8 = tpidr_el0;
      if (*(long *)(lVar8 + 0x28) != lVar7) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  } while( true );
}


